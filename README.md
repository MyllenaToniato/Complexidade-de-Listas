# Análise de Complexidade de Algoritmos (Listas)

Projeto de análise e implementação construído para a disciplina de **Técnicas de Programação Avançada (TPA)**, no curso de Bacharelado em Sistemas de Informação do **Instituto Federal do Espírito Santo (IFES) - Campus Serra**.

## 📌 Sumário
1. [Introdução](#1-introdução)
2. [Estrutura do Projeto](#2-estrutura-do-projeto)
3. [Tecnologias Utilizadas](#3-tecnologias-utilizadas)
4. [Como Executar](#4-como-executar)
5. [Relatório Final](#5-relatório-final)
6. [Autores](#6-autores)

---

## 1. Introdução
O objetivo central deste trabalho é o estudo da análise de complexidade das operações fundamentais de uma estrutura de lista encadeada, como adicionar, pesquisar, remover e retornar a quantidade de nós. 

Além da implementação manual (autoral), o projeto compara o desempenho empírico com as classes nativas `ArrayList` e `LinkedList` do Java. Foram realizados testes de estresse com volumes de 100 mil, 200 mil e 400 mil registros para validar as ordens de complexidade teóricas (Notação Big O) em cenários de pior caso.

## 2. Estrutura do Projeto
O código está organizado seguindo padrões de modularização e encapsulamento:

```text
├── src
│   └── br.ifes.tpa
│       ├── app             # Classe Main e interface de interação com o usuário
│       ├── biblioteca      # Implementação da Lista Encadeada Autoral e 'Wrappers' (ArrayList/LinkedList)
│       ├── dominio         # Modelagem do objeto de domínio (Series.java)
│       └── util            # Classes utilitárias para medição de tempo e resultados
├── series_100k.txt         # Arquivo com 100.000 registros
├── series_200k.txt         # Arquivo com 200.000 registros
├── series_400k.txt         # Arquivo com 400.000 registros
└── dados.txt               # Arquivo para testes iniciais
```

* **`ListaEncadeada.java`**: Implementação autoral da estrutura de dados.
* **`IColecao.java`**: Interface que define o contrato para garantir a interoperabilidade entre as diferentes listas.

## 3. Tecnologias Utilizadas
* **Java 17+**: Linguagem utilizada para o desenvolvimento de todas as estruturas e lógica de medição.
* **System.nanoTime()**: Função utilizada para capturar o tempo de execução com precisão de nanossegundos.
* **Markdown**: Utilizado para a documentação e estruturação deste README.

## 4. Como Executar
O repositório já contém os arquivos de dados necessários para a análise. Siga os passos abaixo:

1. Clone o repositório em seu ambiente local.
2. Abra o projeto em sua IDE Java de preferência (IntelliJ IDEA, Eclipse ou VS Code).
3. Certifique-se de que os arquivos de dados (`series_*.txt`) estejam na pasta raiz do projeto para que sejam localizados pela classe `Main`.
4. Execute a classe `Main.java` localizada no pacote `br.ifes.tpa.app`.
5. Selecione a estrutura desejada no menu interativo e observe as métricas de tempo impressas no console.

## 5. Relatório Final
A documentação completa com as análises matemáticas linha a linha e a interpretação detalhada dos resultados obtidos pode ser acessada aqui:

👉 **https://docs.google.com/document/d/1_brTOyuzzknXgr8i7b4ob3cDiQPNZ3ys0t5zrXHipFo/edit?usp=sharing**

## 6. Autores
* **Myllena Furtado Toniato** 
* **Rodrigo Lyrio Rodrigues** 
* **Ronnald Willian** 
