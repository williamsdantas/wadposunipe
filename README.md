# wadposunipe/fundamentos: Projeto inicial da pos-graduação, criado para registrar informações sobre as disciplinas do curso.
O projeto de uma página web estática de identificação pessoal e profissional, construido utilizando apenas HTML e CSS.

<h2>Pós em Desenvolvimento Web Full Stack da Unipê</h2>

<table style="width:100%">
  <tr>
    <th>Disciplica</th>
    <th>Professor</th>
    <th>Nota</th>
  </tr>
  <tr>
    <td>Fundamentos e Arquitetura Web</td>
    <td>Daniel Brandão</td>
    <td>10.0</td>
  </tr>
  
</table>

# Fundamentos Site Docker

## Descrição

Este repositório contém a configuração de um site estático simples, servido com NGINX em um container Docker.

## Estrutura de Pastas

```
/fundamentos
  ├── index.html
  └── assets
      └── img
Dockerfile
README.md
```

## Comandos para Construção e Execução

### 1. Construir a imagem Docker

```bash
docker build -t fundamentos-site .
```

### 2. Executar o container

```bash
docker run -d -p 8080:80 seuusuario/fundamentos-site
```

Acesse o site em [http://localhost:8080](http://localhost:8080).

### 3. Publicar no Docker Hub

#### 3.1 Fazer login no Docker Hub

```bash
docker login
```

Digite seu usuário e senha.


#### 3.2 Fazer push para o Docker Hub

```bash
docker push seuusuario/fundamentos-site:latest
```

### 4. Verificar no Docker Hub

Acesse [https://hub.docker.com](https://hub.docker.com) e confirme que a imagem foi publicada com sucesso.

## Notas

- Certifique-se de substituir `seuusuario` pelo seu nome de usuário no Docker Hub.
- Para uma estrutura mais completa do site, basta adicionar os arquivos dentro da pasta `fundamentos`.


