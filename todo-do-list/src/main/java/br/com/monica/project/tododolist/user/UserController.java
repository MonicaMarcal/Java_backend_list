package br.com.monica.project.tododolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired //gerenciando todo o ciclo de vida pelo spring
    private IUserRepository userRepository;


    //metodo que recebe dados do usuario
    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel){

            var user = this.userRepository.findByUsername(userModel.getUsername());
            if(user != null){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario já existe");
            }

            //criptografando senha do usuario
            var passwordHashed = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());
            userModel.setPassword(passwordHashed);

            var userCreated =  this.userRepository.save(userModel);
            return ResponseEntity.status(HttpStatus.OK).body(userCreated);
    }
    
}
