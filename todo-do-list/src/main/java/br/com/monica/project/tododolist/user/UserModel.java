package br.com.monica.project.tododolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data //getters e setters
@Entity(name = "tb_users")//nome da tabela
public class UserModel {

    @Id //notation
    @GeneratedValue(generator = "UUID")
    private UUID id; //id generator
    
    @Column(unique = true)
    private String username;
    private String name;
    private String password; 

    @CreationTimestamp
    private LocalDateTime createdAt; //acesso a hora que o dado for criado

}

