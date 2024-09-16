// Configuração dos repositórios para plugins
pluginManagement {
    repositories {
        // Repositório para plugins do Android e outros plugins
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

// Configuração de resolução de dependências para o projeto
dependencyResolutionManagement {
    // Define o modo de resolução de repositórios para falhar se repositórios de projetos forem usados
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // Repositórios para dependências do projeto
        google()
        mavenCentral()
    }
}

// Nome do projeto raiz
rootProject.name = "Challenge_Mobile"

// Incluindo o módulo :app no projeto
include(":app")
