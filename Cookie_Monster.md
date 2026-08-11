# Relatório CTF

**Nome:** Hiago

---

## Desafio: Cookie Monster

### Análise do Desafio

O desafio dava apenas um link de acesso a um site.

```text
https://monster.discloud.app/
```

O objetivo era achar uma falha no site que desse acesso de administrador
e revelasse a flag.

### Analisando o Site

Ao acessar o site, foi usado o **Inspecionar** do navegador pra dar uma olhada
em como ele funcionava por trás.

Na aba **Application**, em **Cookies**, foi encontrado um cookie com uma
variável chamada `admin`, com o valor:

```text
admin = nao
```

### Resolvendo

Trocando o valor da variavel de `nao` pra `sim` e recarregando a pagina:

```text
admin = sim
```

Ganhamos acesso

### Resolução

A validação de admin era feita só pelo cookie,
sem nenhuma checagem no servidor. Bastou trocar `admin=nao` por
`admin=sim` manualmente para escalar o acesso e pegar a flag.

### Flag

```text
FLAG{C00K1E_M0NST3R_MUNCH}
```
