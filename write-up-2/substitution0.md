# Relatório CTF

**Nome:** Hiago

---

## Desafio: Substitution 0

### Análise do Arquivo

O arquivo `message.txt` contém um alfabeto embaralhado na primeira linha e,
nas linhas seguintes, uma mensagem cifrada. Esse alfabeto fornece a chave da
cifra de substituição: cada letra do alfabeto normal corresponde à letra que
ocupa a mesma posição na sequência embaralhada.

```text
Alfabeto normal:       ABCDEFGHIJKLMNOPQRSTUVWXYZ
Alfabeto de substituição: HRZUEVABDLIOJYTGNXCMWPKSQF
```

Para decifrar, fiz o mapeamento inverso: cada letra cifrada é substituída pela
letra do alfabeto normal que está na mesma posição. O processo preserva
maiúsculas e minúsculas e deixa pontuação e números sem alteração.

### Decifrando a Mensagem

Para decifrar o texto, abri o [CyberChef](https://gchq.github.io/CyberChef/)
e colei a mensagem de `message.txt` na entrada, deixando de fora a primeira
linha, que contém o alfabeto de substituição.

Em seguida, adicionei a operação **Substitute**. Como o texto estava cifrado,
configurei o alfabeto embaralhado como o conjunto de letras a substituir e o
alfabeto normal como o resultado:

```text
Plaintext:    HRZUEVABDLIOJYTGNXCMWPKSQF
Ciphertext:   ABCDEFGHIJKLMNOPQRSTUVWXYZ
Ignore case:  ativado
```

Embora os campos se chamem **Plaintext** e **Ciphertext**, para decifrar
precisei fazer esse mapeamento inverso: cada letra do alfabeto cifrado é
convertida para a letra correspondente do alfabeto normal. Ativei **Ignore
case** para preservar as letras maiúsculas e minúsculas do texto.

O resultado revelou a flag:

### Flag

```text
academy{5UB5717U710N_3V0LU710N_4FBD1EB7}
```
