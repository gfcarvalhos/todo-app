# App ToDo list

**Disciplina:** Tópicos em Engenharia da Computação II - Introdução a Programação Funcional
**Curso:** Engenharia da Computação — Universidade Federal do Maranhão (UFMA)  
**Discente:** Gabriel Felipe Carvalho Silva

- Link do Tutorial: `https://profsergiocosta.notion.site/Tutorial-Clojure-ClojureScript-Construindo-uma-Aplica-o-Persistente-e-Reativa-2a5cce975093807aa9f0f0cb0cf69645`

---

## Descrição

Aplicação de lista de tarefas (Todo List) com backend em Clojure e frontend em ClojureScript.  
Stack principal: Clojure / ClojureScript, Reagent 2.0 (React 18), Ring, Reitit, next.jdbc.  
Filosofia: reatividade explícita no frontend e API REST pura no backend.

---

## Tecnologias

- Backend: Clojure, Ring, Reitit, next.jdbc
- Frontend: ClojureScript, Reagent 2.0 (React 18)
- Build / CLI: clj (Clojure CLI), shadow-cljs (para o frontend)
- JVM: Java JDK 11+ recomendado

## Como Rodar

Pré-requisitos

- Java JDK 11 ou superior instalado
- Clojure CLI (`clj`) instalado
- Node.js + npm (ou yarn)
- [Opcional] Banco de dados compatível com next.jdbc (ex.: PostgreSQL)

1. Clone o repositório
   git clone <repo-url>
   cd todo-app

2. Instalar dependências do frontend

   - Se houver package.json para o frontend:
     npm install
     (ou) yarn

3. Iniciar o backend (Terminal 1)
   clj -M:run

   - Usa o alias `:run` definido em deps.edn que aponta para `todo.backend.core`.
   - Configure variáveis de ambiente / arquivo de configuração para conexão com o DB conforme necessário (ex.: DATABASE_URL).

4. Iniciar o frontend (Terminal 2)
   npx shadow-cljs watch app
   - Ajuste o comando se o projeto usar outro nome de build no shadow-cljs.edn.
