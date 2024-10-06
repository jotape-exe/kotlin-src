
# Vetor em Kotlin

---

### Recursos

- **Adicionar Elemento**
    - `add(valor: T)`: Adiciona um elemento ao final do vetor.
    - `add(posicao: Int, valor: T)`: Adiciona um elemento em uma posição específica do vetor.

- **Remover Elemento**
    - `remove(posicao: Int)`: Remove o elemento na posição especificada.
    - `remove(elemento: T?)`: Remove a primeira ocorrência do elemento especificado.

- **Limpar Vetor**
    - `clear()`: Remove todos os elementos do vetor.

- **Operações**
    - `length()`: Retorna o tamanho atual do vetor.
    - `get(posicao: Int)`: Retorna o elemento na posição especificada.
    - `get(elemento: T?)`: Retorna a posição da primeira ocorrência do elemento especificado.
    - `contains(elemento: T?)`: Verifica se o vetor contém o elemento especificado.
    - `lastIndexOf(elemento: T?)`: Retorna a posição da última ocorrência do elemento especificado.

- **Clonagem**
    - `clone()`: Retorna uma cópia do vetor.

## Kotlin Features Utilizadas

- **Operador `..`**: Usado para criar ranges em loops.
- **Operador `in`**: Utilizado para verificar se um valor está contido em um range.
- **Operador `get`**: Sobrecarregado para acessar elementos do vetor.
- **Operador `+=`**: Utilizado para adicionar strings em loops.
- **Interpolação de Strings**: Usada para gerar a representação em string do vetor.

## Exemplo de Uso

```kotlin
fun main() {
    val vetor = Vetor<Int>(10)

    vetor.add(1)
    vetor.add(2)
    vetor.add(3)

    println("Vetor: $vetor")
    println("Tamanho: ${vetor.length()}")
    println("Elemento na posição 1: ${vetor[1]}")
    println("Posição do elemento 3: ${vetor.get(3)}")

    vetor.remove(1)
    println("Vetor após remover elemento na posição 1: $vetor")
}
```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

--- 

Isso deve te ajudar a explicar a implementação do vetor e os recursos do Kotlin que você utilizou.