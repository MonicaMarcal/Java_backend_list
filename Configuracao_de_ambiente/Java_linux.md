## Instalação

A instalação do java pode ser feita através do link:<br> https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.deb ( sha256)

### No terminal:

```
sudo apt update
```
```
cd ~/Downloads && sudo apt install ./jdk-17_linux-x64_bin.deb
```

### Verificando versão:
```
java -version
```
```
javac -version
```

## **Defina o JAVA_HOME:**

`JAVA_HOME` é uma variável de ambiente usada para apontar para a localização do diretório principal da instalação do Java em seu sistema. Essa variável é frequentemente usada por aplicativos e scripts que dependem do Java para funcionar corretamente.

Agora, você precisa configurar a variável de ambiente **`JAVA_HOME`** para apontar para a instalação do Java 17. Abra o arquivo **`~/.bashrc`** no seu editor de texto preferido (como o Nano ou o Gedit) usando o seguinte comando:


```jsx
nano ~/.bashrc
```

No final do arquivo, adicione a seguinte linha para definir **`JAVA_HOME`**:

```jsx
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
```

Certifique-se de substituir **`/usr/lib/jvm/java-17-openjdk-amd64`** pela localização real da sua instalação do Java 17, se for diferente.
<br>

`Para salvar o arquivo no nano:`

1. Para salvar as alterações, pressione **`Ctrl + O`** (a tecla "Control" e a letra "O" ao mesmo tempo).
2. Você verá uma mensagem na parte inferior do terminal pedindo para "Write Out" (escrever para fora). Pressione **`Enter`** para confirmar.
3. Em seguida, você pode optar por manter o mesmo nome de arquivo pressionando **`Enter`** novamente ou especificar um novo nome de arquivo se desejar. Para manter o mesmo nome de arquivo, basta pressionar **`Enter`** novamente.
4. Para sair do Nano, pressione **`Ctrl + X`**.

<br>
Para aplicar as mudanças na variável **`JAVA_HOME`**, você pode carregar novamente o arquivo de perfil ou abrir um novo terminal. Use o seguinte comando para recarregar o arquivo **`.bashrc`**:

```jsx
source ~/.bashrc
```

Reinicie o computador.

Você pode verificar se a variável **`JAVA_HOME`** foi configurada corretamente executando o seguinte comando no terminal:
```
echo $JAVA_HOME
```
<img src="./images/4.png">