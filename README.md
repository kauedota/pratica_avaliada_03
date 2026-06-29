# 🚀 Exercícios de Programação Orientada a Objetos

Este repositório contém três atividades práticas desenvolvidas em Java, aplicando conceitos fundamentais de **POO** como **herança**, **polimorfismo**, **validação** e **tratamento de exceções**.

---

## 1️⃣ Sistema de Usuários 👤

### Objetivo
Gerenciar usuários com atributos básicos e aplicar validações.

### Funcionalidades
- Classe `Usuario` com atributos como nome, email e senha.
- Métodos `get` e `set` com validações.
- Tratamento de dados inválidos via exceções.

### Cenários de teste
- Usuário válido criado com sucesso.
- Usuário com email inválido.
- Usuário com senha vazia ou curta.
- Usuário com nome vazio.

---

## 2️⃣ Sistema de Usuários 👤

### Objetivo
Gerenciar usuários com atributos básicos e aplicar validações.

### Funcionalidades
- Classe `Usuario` com atributos como nome, email e senha.
- Métodos `get` e `set` com validações.
- Tratamento de dados inválidos via exceções.

### Cenários de teste
- Usuário válido criado com sucesso.
- Usuário com email inválido.
- Usuário com senha vazia ou curta.
- Usuário com nome vazio.

---

## 3️⃣ Sistema de Notificações 📱

### Objetivo
Implementar envio de notificações por **Email** e **SMS**, aplicando **herança** e **polimorfismo**.

### Estrutura
- **Classe base `Notificacao`**
  - Atributo: `destinatario`
  - Métodos: construtor, `get/set`, `enviar(mensagem)`
- **Subclasse `NotificacaoEmail`**
  - Sobrescreve `enviar` para envio por email.
- **Subclasse `NotificacaoSMS`**
  - Sobrescreve `enviar` para envio por SMS.
- **Classe `Validacao`**
  - Valida mensagem (não nula/vazia).
  - Valida destinatário (email ou telefone válido via regex).
- **Classe `TestaNotificacoes`**
  - Método `criarNotificacao(tipo, destinatario, mensagem)`.
  - Testes com tipos válidos e inválidos.

### Cenários de teste
- Email válido.
- SMS válido.
- Mensagem vazia.
- Destinatário vazio.
- Tipo inexistente.

---

## 🛠️ Tecnologias Utilizadas
- **Java SE**
- **POO (Herança, Polimorfismo, Encapsulamento)**
- **Regex para validação**
- **Tratamento de exceções (`try/catch`)**

---

## 📌 Observações
- Todos os exercícios foram feitos com foco em **boas práticas de programação**.
- As mensagens de erro foram personalizadas para ficarem mais **amigáveis e informativas**.
- Os commits foram registrados com ícones temáticos (🚗, 👤, 📱) para facilitar a identificação no histórico.

---

## 🎯 Conclusão
Essas atividades consolidam os principais conceitos de **Programação Orientada a Objetos**, mostrando como aplicar validações, herança e polimorfismo em sistemas reais.

