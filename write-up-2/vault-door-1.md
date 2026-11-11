# Relatório CTF

**Nome:** Hiago

---

## Desafio: Vault-door-1

### Análise do Desafio

O desafio forneceu o código Java `VaultDoor1.java`, cuja função original
comparava os caracteres de uma senha em posições específicas. As comparações
fora de ordem permitiam reconstruir a sequência esperada.

### Resolução

Alterei `checkPassword` para montar e retornar a senha como `String`. A função
usa um `StringBuilder` com 32 posições e preenche cada caractere nos índices
correspondentes às comparações originais. A `main` chama a função e imprime a
flag completa. Assim, não é necessário digitar a senha.

### Compilando e Executando

Execute os comandos a partir da pasta principal do projeto, que contém a pasta
`cods`.

#### Windows — PowerShell

```powershell
javac .\cods\VaultDoor1.java
java -cp .\cods VaultDoor1
```

#### Windows — CMD

```cmd
javac cods\VaultDoor1.java
java -cp cods VaultDoor1
```

#### Linux — Terminal

```bash
javac cods/VaultDoor1.java
java -cp cods VaultDoor1
```

O comando `javac` cria `VaultDoor1.class`. Ao executar a classe, a flag é
impressa diretamente no terminal.

### Flag

```text
academy{d35cr4mbl3_tH3_cH4r4cT3r5_e3ff63}
```
