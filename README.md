# Sistema de Cadastro de Academia

## Descrição do projeto

Este projeto é um sistema simples feito em Java para representar o cadastro de pessoas em uma academia. O sistema possui alunos normais, alunos com personal e personal trainers.

A ideia principal do projeto é praticar conceitos básicos de Programação Orientada a Objetos, como classes, objetos, atributos, métodos, encapsulamento, herança e sobrescrita de métodos.

## Classes do projeto

### Pessoa

A classe Pessoa é a classe principal do projeto. Ela possui informações básicas como nome, idade, telefone e CPF. Também possui métodos getters e setters para acessar e alterar esses dados.

### Aluno_n

A classe Aluno_n representa um aluno normal da academia, ou seja, um aluno que não possui personal trainer. Ela herda os dados da classe Pessoa e adiciona o atributo matrícula.

### Aluno_p

A classe Aluno_p representa um aluno que possui personal trainer. Além dos dados herdados da classe Pessoa, ela possui matrícula e o nome do personal responsável pelo aluno.

### Personal

A classe Personal representa um profissional da academia. Ela também herda os dados da classe Pessoa e adiciona o atributo salário.

### Main

A classe Main é responsável por executar o programa. Nela são criados exemplos de aluno normal, aluno com personal e personal trainer. Depois, os dados são exibidos no console.

## Conceitos de POO utilizados

### Classe

Foram criadas classes para representar elementos do sistema, como Pessoa, Aluno_n, Aluno_p e Personal.

### Objeto

Na classe Main, foram criados objetos a partir das classes, como um aluno normal, um aluno com personal e um personal trainer.

### Encapsulamento

Os atributos das classes foram definidos como private, e o acesso a eles é feito por meio de métodos getters e setters.

### Herança

As classes Aluno_n, Aluno_p e Personal herdam da classe Pessoa, reaproveitando atributos e métodos em comum.

## Como executar

1. Abra os arquivos no VS Code ou em outra IDE Java.
2. Compile todos os arquivos `.java`.
3. Execute a classe `Main`.
4. O programa exibirá no console os dados dos alunos e do personal.

## Observação

O projeto foi desenvolvido com fins acadêmicos, para praticar os primeiros conceitos de Java e Programação Orientada a Objetos.
