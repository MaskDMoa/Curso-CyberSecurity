# Relatório CTF

**Nome:** Hiago

---

## Desafio: First-find

### Análise do Desafio

O desafio forneceu um arquivo compactado chamado `files.zip` e pediu para
encontrar o arquivo `uber-secret.txt`. Como ele poderia estar dentro de uma
estrutura de pastas extensa, era necessário procurar pelo nome do arquivo em
todos os diretórios extraídos.

### Procurando o Arquivo

Após extrair o conteúdo do ZIP, é possível procurar `uber-secret.txt` de
forma recursiva. Abaixo estão comandos para diferentes terminais. Nos exemplos
do Windows, `OutroUsuario` é um nome fictício; ajuste o caminho para a pasta
onde os arquivos foram extraídos.

#### Windows — PowerShell

```powershell
Get-ChildItem -Path "$HOME\Downloads\files\files" -Recurse -Filter "uber-secret.txt" -File |
    Select-Object -ExpandProperty FullName
```

#### Windows — CMD

```cmd
where /r "C:\Users\OutroUsuario\Downloads\files\files" uber-secret.txt
```

#### Linux — Terminal

```bash
find ~/Downloads/files/files -type f -name "uber-secret.txt"
```

No PowerShell, o resultado pode ser aberto com `Get-Content`; no CMD, com
`type`; e no Linux, com `cat`. Por exemplo:

```powershell
Get-Content "C:\Users\OutroUsuario\Downloads\files\files\adequate_books\more_books\.secret\deeper_secrets\deepest_secrets\uber-secret.txt"
```

```cmd
type "C:\Users\OutroUsuario\Downloads\files\files\adequate_books\more_books\.secret\deeper_secrets\deepest_secrets\uber-secret.txt"
```

```bash
cat ~/Downloads/files/files/adequate_books/more_books/.secret/deeper_secrets/deepest_secrets/uber-secret.txt
```

O arquivo foi encontrado neste diretório:

```text
C:\Users\OutroUsuario\Downloads\files\files\adequate_books\more_books\.secret\deeper_secrets\deepest_secrets\uber-secret.txt
```

### Resolução

Acessei o arquivo encontrado e obtive a flag do desafio.

### Flag

```text
academy{f1nd_15_f457_ab443fd1}
```