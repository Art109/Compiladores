## Projeto Escola Notificação SOLI.D.

Neste projeto temos apenas as classes necessárias para apresentar o princípio 
D: Dependency Inversion do SOLID

## Classes

- Para este exemplo, temos as seguintes classes:

- Serviços:
	- AtivacaoMatriculaService
	- EmissaoCertificadoService
	- AtrasoBBTService
- Abstrações
	- INotificacao
	- NotificacaoEMAIL
	- NotificacaoSMS
	- NotificacaoWHATS


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
