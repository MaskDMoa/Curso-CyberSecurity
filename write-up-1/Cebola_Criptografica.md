# Relatório CTF

**Nome:** Hiago

---

## Desafio: Cebola Criptográfica

### Análise do Desafio

O desafio apresenta uma mensagem informando que o remetente poderia ter
empacotado a informação em várias camadas para burlar os filtros.

O desafio fornecia um arquivo chamado `flag.txt`, contendo uma sequência
formada apenas por `0` e `1`.

O objetivo era identificar as diferentes camadas de codificação utilizadas
no arquivo e realizar a decodificação até encontrar a flag.

### Analisando o Arquivo

Ao abrir o arquivo `flag.txt`, foi encontrada uma sequência:

```text
00110101 00110010 00100000 00110110 01100010 00100000 00110111 00111000 00100000 00110100 00110010 00100000 00110101 00110010 00100000 00110011 00110011 00100000 00110111 00110100 00100000 00110100 00110101 00100000 00110100 01100100 00100000 00110101 00111000 00100000 00110101 00111001 00100000 00110111 01100001 00100000 00110110 00110011 00100000 00110110 01100001 00100000 00110101 00110101 00100000 00110011 00110000 00100000 00110110 00110011 00100000 00110011 00110001 00100000 00110011 00111001 00100000 00110110 01100001 00100000 00110100 01100101 00100000 00110100 00110111 00100000 00110011 00110000 00100000 00110011 00110000 00100000 00110101 00110010 00100000 00110100 00110100 00100000 00110101 00110001 00100000 00110011 00110001 00100000 00110110 00110110 00100000 00110101 00110001 00100000 00110011 01100100 00100000 00110011 01100100
```

### Resolvendo

Utilizando o site **[Dcode](https://www.dcode.fr/en)** e sua ferramenta de identificação de criptografia, foi possível resolver todas as cifragens.

#### Primeira Parte

A ferramenta indicou que a sequência poderia ser interpretada como ASCII
binário.

Utilizando a ferramenta de conversão ASCII do dCode, o conteúdo foi convertido para:

```text
52 6b 78 42 52 33 74 45 4d 58 59 7a 63 6a 55 30 63 31 39 6a 4e 47 30 30 52 44 51 31 66 51 3d 3d
```

#### Segunda Parte

Após passar novamente na ferramenta, foi obtido o mesmo tipo de conversão.

Colocando novamente, foi obtido:

```text
RkxBR3tEMXYzcjU0c19jNG00RDQ1fQ==
```

#### Terceira Parte

Foi identificada a utilização de Base64.

Passando novamente, obtemos:

```text
FLAG{D1v3r54s_c4m4D45}
```

### Resolução

A resolução consistiu em identificar e remover cada uma das camadas de
codificação presentes no arquivo flag.txt.

A cadeia de decodificação foi:

Binário → ASCII → ASCII → Base64 → Flag

### Flag

A flag encontrada foi:

```text
FLAG{D1v3r54s_c4m4D45}
```
