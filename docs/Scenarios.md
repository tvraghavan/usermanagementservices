# Scenarios

**Create Basic User**

```json http
{
  "method": "post",
  "url": "https://usermanagement/create",
  "headers": {
    "Content-Type": "application/json",
    "Authorization": "Bearer abcd"
  },
  "body": {
    "userid": "admin",
    "firstname": "admin",
    "lastname": "user",
    "status": "A",
    "emailid": "admin@email.com"
  }
}
```

**Create User With Additional Fields**

```json http
{
  "method": "post",
  "url": "https://usermanagement/create",
  "headers": {
    "Content-Type": "application/json",
    "Authorization": "Bearer abcd"
  },
  "body": {
  "userid": "admin",
  "firstname": "admin",
  "lastname": "user",
  "status": "A",
  "emailid": "admin@email.com",
  "mobilenumber": "9700012345"
}
}
