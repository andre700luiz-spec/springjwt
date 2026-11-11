# springjwt

Autenticação e autorização com Spring Boot, Spring Security e JWT (Ciclo 4 - Unilavras).

## Como rodar

```
mvn spring-boot:run
```

## Testar (Postman)

1. `POST http://localhost:8080/rest/auth/login` com body JSON:
   ```json
   { "email": "exemplo@email.com", "password": "123456" }
   ```
   Retorna `email` e `token`.
2. `GET http://localhost:8080/rest/home` com `Authorization: Bearer <token>` retorna `hello world`.

> Projeto didático: senha em texto puro e usuário fixo no `UserRepository`.
