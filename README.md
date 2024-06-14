# SistemaFuncionarios-Empresa-MGS
Sistematização Faculdade CEUB

O "Sistema de Funcionários" é uma aplicação Java que permite o gerenciamento de informações de funcionários, como nome, telefone, e-mail, alergias e problemas médicos. O sistema coleta dados pelo terminal e permite que as informações sejam exibidas e atualizadas conforme o identificador do funcionário.

### Pré-requisitos

Antes de começar, certifique-se de ter os seguintes softwares instalados:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/)
- [Git](https://git-scm.com/downloads)

### Instalação

#### Clonando o Repositório

1. Abra o terminal ou prompt de comando.
2. Navegue até o diretório onde deseja clonar o projeto.
3. Execute o comando:

    ```bash
    git clone https://github.com/seu-usuario/SistemaFuncionarios.git
    ```

#### Importando o Projeto no Eclipse

1. Abra o Eclipse.
2. Vá para `File` > `Import...`.
3. Selecione `Existing Maven Projects` (ou `Existing Projects into Workspace` se não estiver usando Maven) e clique em `Next`.
4. Clique em `Browse...` e selecione o diretório onde o repositório foi clonado.
5. Clique em `Finish`.

### Uso

#### Executando a Aplicação

1. No Eclipse, localize a classe `Main` dentro do pacote `com.sistemafuncionarios`.
2. Clique com o botão direito na classe `Main` e selecione `Run As` > `Java Application`.

#### Operações Disponíveis

No terminal, você verá um menu com as seguintes opções:

1. Adicionar funcionário
2. Buscar e exibir funcionário
3. Sair

**Adicionar Funcionário**:

- Insira as informações solicitadas (nome, ID, telefone, e-mail, alergias, problemas médicos).

**Buscar e Exibir Funcionário**:

- Insira o ID do funcionário para exibir suas informações.

### Estrutura do Projeto

A estrutura do projeto está organizada da seguinte maneira:

SistemaFuncionarios/
├── src/
│ └── com/
│ └── sistemafuncionarios/
│ ├── Funcionario.java
│ └── Main.java
│ ├── SistemaFuncionarios.java
│ ├──module-info.java
│ ├──.classpath
├── .gitignore
└── README.md

- `Funcionario.java`: Define a classe `Funcionario` com atributos e métodos de acesso.
- `SistemaFuncionarios.java`: Gerencia a lista de funcionários e operações de atualização.
- `Main.java`: Contém a lógica principal para interação com o usuário via terminal.

### Autores

- [Amanda Lopes Silva](https://github.com/Amandals33)
