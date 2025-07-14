# 📋 TaskManager - Sistema de Gerenciamento de Tarefas

Um sistema web para gerenciamento de tarefas desenvolvido com **Spring Boot** e **Thymeleaf**.

## 🚀 Funcionalidades

- ✅ **CRUD Completo**: Criar, listar, editar e excluir tarefas
- 📊 **Status de Tarefas**: Em Andamento, Concluído, Cancelado
- 🔍 **Filtros**: Visualizar todas as tarefas ou apenas as em andamento
- 📄 **Detalhes**: Página completa com todas as informações da tarefa
- 🎨 **Interface Moderna**: Design responsivo com Bootstrap 5

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.4**
- **Spring Web MVC**
- **Thymeleaf** (Template Engine)
- **Bootstrap 5** (Frontend)
- **Maven** (Gerenciamento de dependências)

## 📋 Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- **Java 21** ou superior
- **Maven 3.6+**
- **Git**

### Verificar instalações:
```bash
java --version
mvn --version
git --version
```

## 🚀 Como Executar o Projeto

### 1. Clone o repositório
```bash
git clone https://github.com/giolvani/lista-tarefa.git
cd lista-tarefa
```

### 2. Compile o projeto
```bash
mvn clean compile
```

### 3. Execute a aplicação
```bash
mvn spring-boot:run
```

**Ou execute diretamente o JAR:**
```bash
mvn clean package
java -jar target/task-manager-0.0.1-SNAPSHOT.jar
```

### 4. Acesse a aplicação
Abra seu navegador e acesse: **http://localhost:8082**

## 📱 Como Usar

### Página Principal
- Visualize todas as tarefas cadastradas
- Use os filtros para ver apenas tarefas "Em Andamento"
- Clique no título de uma tarefa para ver seus detalhes

### Criar Nova Tarefa
1. Clique no botão **"Nova Tarefa"**
2. Preencha os campos obrigatórios:
   - Título
   - Data
   - Descrição
3. Clique em **"Cadastrar"**

### Editar Tarefa
1. Na lista de tarefas, clique em **"Editar"**
2. Modifique os campos desejados (incluindo o status)
3. Clique em **"Salvar Alterações"**

### Visualizar Detalhes
1. Clique no **título da tarefa** na lista
2. Visualize todas as informações completas
3. Acesse opções de edição e exclusão

## 🗂️ Estrutura do Projeto

```
src/
├── main/
│   ├── java/br/edu/ifpr/task_manager/
│   │   ├── controllers/
│   │   │   └── TaskController.java      # Controlador principal
│   │   ├── models/
│   │   │   ├── Task.java               # Modelo da tarefa
│   │   │   └── TaskStatus.java         # Enum de status
│   │   └── TaskManagerApplication.java  # Classe principal
│   └── resources/
│       ├── templates/                   # Templates Thymeleaf
│       │   ├── task-list.html          # Lista de tarefas
│       │   ├── task-create.html        # Criar tarefa
│       │   ├── task-edit.html          # Editar tarefa
│       │   └── task-details.html       # Detalhes da tarefa
│       └── application.properties       # Configurações
```

## 🎯 Rotas da Aplicação

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | `/` ou `/tasks` | Lista todas as tarefas |
| GET | `/tasks/create` | Formulário de criação |
| POST | `/tasks/create` | Salvar nova tarefa |
| GET | `/tasks/edit/{id}` | Formulário de edição |
| POST | `/tasks/edit` | Salvar alterações |
| GET | `/tasks/details/{id}` | Detalhes da tarefa |
| GET | `/tasks/remove/{id}` | Excluir tarefa |
| GET | `/tasks/em-andamento` | Filtrar tarefas em andamento |

## 🔧 Configurações

### Porta do Servidor
Por padrão, a aplicação roda na porta **8082**. Para alterar, edite o arquivo `application.properties`:

```properties
server.port=8081
```

### Perfil de Desenvolvimento
Para ativar o hot-reload durante desenvolvimento:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

## 🤝 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor

**Giolvani**
- GitHub: [@giolvani](https://github.com/giolvani)
- Email: inavloig@gmail.com

---

⭐ Se este projeto foi útil para você, considere dar uma estrela no repositório!
