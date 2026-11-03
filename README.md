# Digital Banking Platform

A simulated digital banking platform built with **Kotlin, Spring Boot, and Microservices Architecture**. The project explores modern backend engineering concepts, distributed systems, and event-driven architecture through practical banking use cases.

## Overview

The platform allows customers to manage bank accounts, transfer money, apply for loans, and receive notifications. It also includes fraud detection mechanisms and automated loan approval workflows.

The system is designed as a collection of independent microservices that communicate through REST APIs and asynchronous messaging.

## Core Domains

| Domain | Description |
|---|---|
| **Account Management** | Create and manage bank accounts, view account details, and freeze or reactivate accounts. |
| **Money Transfer** | Transfer money between internal accounts, simulate external bank transfers, manage daily limits, and schedule recurring transfers. |
| **Loan Management** | Submit loan applications, calculate repayment schedules, and manage approval workflows. |
| **Fraud Detection** | Analyze transactions, detect suspicious activities, and flag potentially fraudulent operations. |
| **Notifications** | Notify customers about transfers, loan application updates, and upcoming payments. |

## Architecture

The platform follows a microservices architecture, with each domain implemented as an independent Spring Boot application.

Main components:

- **API Gateway:** Central entry point for client requests.
- **Account Service:** Manages customer accounts and account lifecycle.
- **Transfer Service:** Handles money transfers and financial transactions.
- **Loan Service:** Manages loan applications and repayment schedules.
- **Fraud Detection Service:** Evaluates transaction risks.
- **Notification Service:** Handles customer notifications.
- **Camunda:** Orchestrates loan approval workflows.
- **RabbitMQ:** Enables asynchronous communication between services.

## Technology Stack

- **Language:** Kotlin
- **Framework:** Spring Boot
- **Build Tool:** Gradle (Kotlin DSL)
- **Architecture:** Microservices
- **API Communication:** REST APIs
- **Messaging:** RabbitMQ
- **Database:** PostgreSQL
- **Workflow Engine:** Camunda / BPMN
- **Security:** Spring Security, JWT
- **Containerization:** Docker
- **Orchestration:** Kubernetes

## Engineering Concepts

- Object-Oriented Programming and SOLID principles.
- Design Patterns (Strategy, Factory, Observer, State).
- Concurrency management and race condition prevention.
- Idempotency and transaction consistency.
- Distributed transactions and Saga Pattern.
- Event-Driven Architecture.
- Inter-service communication.
- Database design and transaction management.
- Authentication and authorization.
- Containerization and orchestration.

## Team

Developed collaboratively by a team of **8 developers**, with responsibilities distributed across the different domains and infrastructure components.

## Project Scope

This is an educational and portfolio project designed to simulate banking operations. It does not connect to real bank accounts or financial institutions.

---

**Goal:** Build a realistic backend system that demonstrates how modern banking platforms can be designed using Kotlin, Spring Boot, and distributed system principles.
