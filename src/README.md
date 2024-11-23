# Desafio: Componentes e Injeção de Dependência

## Descrição
Este desafio consiste em criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem de desconto e o valor do frete. O cálculo do valor total do pedido será realizado aplicando o desconto ao valor básico do pedido e somando o valor do frete.

### Regras de Cálculo do Frete
| Valor básico do pedido (sem desconto) | Frete |
|---------------------------------------|-------|
| Abaixo de R$ 100.00                   | R$ 20.00 |
| De R$ 100.00 até R$ 200.00 (exclusive) | R$ 12.00 |
| R$ 200.00 ou mais                     | Grátis |

---

## Objetivos
- **Aplicar conceitos de injeção de dependência** utilizando o framework **Spring**.
- **Criar componentes e serviços** que sejam responsáveis por realizar o cálculo do pedido.
- Garantir a **separação de responsabilidades** no código.

---

## Tecnologias Utilizadas
- **Java**: Linguagem principal do projeto.
- **Spring Framework**: Para gerenciamento de dependências e criação de componentes.
- **Maven**: Gerenciador de dependências.

---

## Autor
Projeto desenvolvido por André L. Proença como parte de um estudo sobre injeção de dependência no Spring Framework.
