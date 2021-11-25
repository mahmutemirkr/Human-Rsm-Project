# Human-Rsm-Project

## Java-Spring Boot RestApi

### Endpoints

#### Sign-Up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "nameSurname": "user",
    "username": "user",
    "password": "user"
}
```

#### Sign-In

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username": "user",
    "password": "user"
}
```

#### Make-admin

```
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!
```

#### Save Person

```
POST /api/person HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
Content-Type: application/json
Content-Length: 119

{
    "name": "Test Person 2",
    .
    ..
    ....
    ......
  
}
```

#### Delete Person

```
DELETE /api/person/1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
```

#### Get All Persons

```
GET /api/person HTTP/1.1
Host: localhost:8080
```
