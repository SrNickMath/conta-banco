# ContaTerminal

A classe `ContaTerminal` representa uma conta bancária com informações básicas, como número da conta, agência, nome do cliente e saldo. Ela permite a criação de uma conta bancária e fornece métodos para acessar essas informações.

## Atributos

- **`numero`**: Um número inteiro que identifica a conta bancária.
- **`agencia`**: Uma string que representa o código da agência onde a conta está registrada.
- **`nomeCliente`**: Uma string que armazena o nome do cliente da conta.
- **`saldo`**: Um número de ponto flutuante que representa o saldo atual da conta.

## Construtor

### `ContaTerminal(int numero, String agencia, String nomeCliente, double saldo)`

Cria uma nova instância da conta bancária com os seguintes parâmetros:

- `numero`: Número da conta.
- `agencia`: Código da agência.
- `nomeCliente`: Nome do cliente.
- `saldo`: Saldo inicial da conta.

## Métodos

### `int getNumero()`

Retorna o número da conta.

### `String getAgencia()`

Retorna o código da agência.

### `String getNomeCliente()`

Retorna o nome do cliente.

### `double getSaldo()`

Retorna o saldo da conta.
