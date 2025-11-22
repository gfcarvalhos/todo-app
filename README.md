# 📝 App Todo List — Programação Funcional (Clojure + ClojureScript)

**Disciplina:** Tópicos em Engenharia da Computação II — Introdução à Programação Funcional  
**Curso:** Engenharia da Computação — Universidade Federal do Maranhão (UFMA)  
**Aluno:** **Gabriel Felipe Carvalho Silva**

**🔗 Tutorial Original:**  
[Tutorial Clojure/ClojureScript: Construindo uma Aplicação Persistente e Reativa](https://profsergiocosta.notion.site/Tutorial-Clojure-ClojureScript-Construindo-uma-Aplica-o-Persistente-e-Reativa-2a5cce975093807aa9f0f0cb0cf69645)

---

## 📌 Descrição do Projeto

Este projeto implementa uma **aplicação Todo List completa**, com:

- **Backend** em Clojure (API REST)
- **Frontend** em ClojureScript utilizando Reagent 2.0 (React 18)
- Persistência de dados com `next.jdbc`
- Roteamento HTTP com Ring + Reitit
- Frontend reativo e interação direta com a API

Ele serve como exercício prático para introdução ao ecossistema funcional do Clojure, integrando conceitos de imutabilidade, reatividade e organização modular.

---

## 🛠️ Tecnologias Utilizadas

### **Backend**

- Clojure
- Ring
- Reitit
- next.jdbc

### **Frontend**

- ClojureScript
- Reagent 2.0 (React 18)
- shadow-cljs (build e hot-reload)

### **Ferramentas / CLI**

- Java JDK 11+
- Clojure CLI (`clj`)
- Node.js + npm (ou yarn)
- shadow-cljs

---

## ▶️ Como Rodar o Projeto

### **1. Pré-requisitos**

Antes de rodar o projeto, instale:

- **Java JDK 11 ou superior**  
  Verifique com:

  ```bash
  java -version
  ```

- **Clojure CLI Tools**
  Verifique com:

```bash
 clj -Sdescribe
```

- **Node.js + npm**
  Verifique com:
  ```bash
     node -v
     npm -v
  ```

### **2. Clonar o projeto**

```bash
git clone <repo-url>
cd todo-app
```

### **3. Instalar dependências do frontend**

```bash
npm install
```

### **4. Iniciar o Backend (Terminal 1)**

```bash
clj -M:run
```

### **5. Iniciar o Frontend (Terminal 2)**

```bash
npx shadow-cljs watch app
```

### **3. Instalar dependências do frontend**

## Estrutura esperada após subir

- Backend ativo: responde na porta configurada `3000`

- Frontend ativo: acessível em `localhost:8000`

- Ao marcar/desmarcar uma tarefa, o frontend faz requisições REST para o backend.
