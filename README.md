# Padrão Decorator - Camadas de Segurança

Implementação do padrão de projeto **Decorator** (Estrutural) em Java, demonstrando como adicionar comportamentos a objetos dinamicamente, sem alterar sua classe original.

##  Descrição

Este projeto implementa o padrão Decorator para modelar **camadas de segurança** que podem ser adicionadas dinamicamente a um sistema básico. Cada camada (criptografia, IDS, backup) adiciona seu custo percentual e sua descrição, sem modificar o sistema original.

### Contexto
O sistema gerencia camadas de proteção que podem ser empilhadas:

**Sistema Base:**
- Sistema Básico (custo base)

**Camadas de Segurança (Decoradores):**
- **Módulo Criptografia**: +20% de custo
- **Módulo IDS** (Intrusion Detection System): +10% de custo
- **Módulo Backup**: +5% de custo

## Estrutura do Projeto
```bash
src/
├── main/
│ └── padroesestruturais/decorator/
│ ├── SistemaSeguranca.java (Interface - Componente)
│ ├── SistemaBasico.java (Componente Concreto)
│ ├── CamadaSegurancaDecorator.java (Decorador Abstrato)
│ ├── ModuloCriptografia.java (Decorador Concreto)
│ ├── ModuloIDS.java (Decorador Concreto)
│ └── ModuloBackup.java (Decorador Concreto)
│
└── test/
└── padroesestruturais/decorator/
└── SistemaSegurancaTest.java (Casos de teste)
```
## Padrão Decorator

### Problema Resolvido
Sem o Decorator, para combinar um sistema básico com todas as combinações possíveis de camadas, seriam necessárias **múltiplas subclasses** (ex: `SistemaComCriptografia`, `SistemaComIDS`, `SistemaComCriptografiaEIDS`, etc.). Com o padrão, podemos **empilhar camadas dinamicamente** em tempo de execução.

### Vantagens
- **Flexibilidade**: Camadas podem ser adicionadas ou removidas em tempo de execução
- **Extensibilidade**: Novas camadas podem ser criadas sem modificar código existente
- **Composição sobre herança**: Evita explosão de subclasses
- **Princípio Aberto/Fechado (OCP)**: Aberto para extensão, fechado para modificação
- **Responsabilidade única**: Cada decorador adiciona apenas uma funcionalidade

### Componentes
- **Componente** (`SistemaSeguranca`): Interface que define o contrato para sistemas e decoradores
- **Componente Concreto** (`SistemaBasico`): Implementação base do sistema
- **Decorador Abstrato** (`CamadaSegurancaDecorator`): Mantém referência ao componente e implementa a interface
- **Decoradores Concretos** (`ModuloCriptografia`, `ModuloIDS`, `ModuloBackup`): Adicionam funcionalidades específicas

## Testes

O projeto possui **4 casos de teste** implementados com **JUnit 5**, validando:

- Custo e camadas com Criptografia (+20%)
- Custo e camadas com IDS (+10%)
- Custo e camadas com Backup (+5%)
- Custo e camadas com múltiplas camadas empilhadas (Criptografia + IDS)

### Como Executar os Testes

1. Abra o projeto no **IntelliJ IDEA**
2. Clique com o botão direito na pasta `test`
3. Selecione **Run 'All Tests'**
4. Verifique se todos os testes passam (barra verde)

Ou via terminal:
```bash
mvn test
```

## Diagrama de Classes
O diagrama UML está disponível na imagem diagrama-decorator.png e mostra:
- A interface SistemaSeguranca
- O componente concreto SistemaBasico
- O decorador abstrato CamadaSegurancaDecorator com dupla relação (implementação + agregação)
- Os 3 decoradores concretos (ModuloCriptografia, ModuloIDS, ModuloBackup)

## Diferença entre os Padrões Estruturais

| Padrão | Foco Principal | Como Funciona | Exemplo no Projeto |
| :--- | :--- | :--- | :--- |
| **Bridge** | Separar abstração da implementação | Duas hierarquias independentes conectadas por composição | Separar tipo de sistema do nível de proteção |
| **Decorator** | Adicionar comportamentos dinamicamente | Empilhar objetos "envolvendo" o componente original | Empilhar camadas de segurança (Criptografia, IDS, Backup) |

## Tecnologias
- Java 21
- JUnit 5 (JUnit Jupiter)
- IntelliJ IDEA
- Maven (gerenciamento de dependências)
- Draw.io (diagrama UML)
  
## Conceitos Aplicados
- Padrão Estrutural Decorator
- Composição sobre herança
- Programação orientada a interfaces
- Princípio Aberto/Fechado (OCP)
- Princípio da Responsabilidade Única (SRP)
- Testes Unitários com JUnit
- Empilhamento dinâmico de comportamentos
