# Projeto de Desenvolvimento Profissional - Equipe NEXUS

## Descrição do Projeto

O Projeto de Desenvolvimento Profissional é um aplicativo inovador que utiliza algoritmos generativos para recomendar cursos, recursos educacionais e oportunidades de carreira personalizadas. O sistema analisa o perfil dos usuários com base em suas áreas de interesse e objetivos de desenvolvimento profissional, oferecendo sugestões personalizadas para ajudá-los a atingir suas metas.

## Integrantes do Projeto

- **Ruan Guedes** - RM551096
- **Ana Beatriz Bento Silva** - RM552536
- **Guilherme Costa Batista** - RM551173
- **Harthley Fernandes Teixeira Gomes** - RM551359

## Funcionalidades

### Frontend

1. **Tela de Login**: Permite que os usuários se autentiquem no aplicativo.
2. **Tela de Cadastro**: Permite que novos usuários se registrem.
3. **Tela de Recuperação de Senha**: Ajuda os usuários a recuperar suas senhas.
4. **Tela de Perfil do Usuário**: Exibe e permite a edição das informações do perfil.
5. **Tela de Recomendações**: Oferece cursos, recursos e oportunidades personalizadas com base no perfil do usuário.
6. **Tela de Busca**: Permite que os usuários busquem cursos e recursos usando filtros e palavras-chave.
7. **Tela de Configurações**: Permite ajustar preferências e acessar configurações adicionais.

### Backend

1. **Autenticação de Usuário**: Valida as credenciais para login e cadastro.
2. **Gerenciamento de Cursos**:
   - Adicionar Cursos
   - Editar Cursos
   - Excluir Cursos

## Arquitetura do Projeto

O aplicativo é estruturado de maneira modular, organizado nas seguintes pastas:

```bash
/app
  /models          # Modelos de dados
  /controllers     # Controladores de lógica de aplicação
  /services        # Serviços e chamadas API
  /views           # Telas e interfaces de usuário
  /utils           # Utilitários e funções auxiliares
/config            # Configurações do projeto
/public            # Recursos públicos (imagens, estilos, etc.)
/tests             # Testes automatizados
```

## Diagrama de Arquitetura

![Diagrama de Arquitetura](![diagrama de arquitetura](https://github.com/user-attachments/assets/0879a610-fe14-4d57-82b7-734e08811f99))

> **Nota:** Diagrama de arquitetura de mobile para representação do escopo do projeto.

## Tecnologias Utilizadas

- **Frontend:** [HTML.js]
- **Backend:** [Node.js]
- **Banco de Dados:** [SQL developer]
- **Outras Tecnologias:** [Android Studio]

## Instruções para Execução

1. **Clone o Repositório**

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

**Instale as Dependências**

## Navegue até o diretório do projeto e instale as dependências necessárias:##

```bash
  cd seu-repositorio
```
```bash
npm install
```

**Configure as variáveis de ambiente conforme necessário. Crie um arquivo .env na raiz do projeto e adicione as variáveis de ambiente necessárias.**

# Inicie o Servidor#

# Para iniciar o servidor de desenvolvimento:#

```bash
  npm start
```

*Abra seu navegador e acesse http://localhost:3000 (ou o URL configurado).*

## APIs Utilizadas

- **API de Recomendação:** Fornece recomendações personalizadas com base no perfil do usuário.
- **API de Perfil:** Permite a criação, leitura, atualização e exclusão de perfis de usuários.
- **API de Busca:** Permite a busca de cursos e recursos educacionais.
- **API de Gerenciamento de Cursos:** Permite adicionar, editar e excluir cursos.

## Recursos de Navegabilidade e Usabilidade

- Navegação fluida entre as telas do aplicativo.
- Interface intuitiva e responsiva.
- Filtros de busca avançados e recomendações personalizadas.
- Feedback visual e interações amigáveis ao usuário.

## Contribuindo

Se você deseja contribuir para o projeto, siga estas diretrizes:

1. Faça um fork do repositório.
2. Crie uma branch para sua nova funcionalidade:

   ```bash
   git checkout -b feature/nova-funcionalidade
