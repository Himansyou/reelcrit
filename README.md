<p align="center">
  <img src="https://github.com/user-attachments/assets/b33290cd-b45a-4781-b72b-d9e154630e4e" alt="Reelcrit Logo" height="300" width="900"/>
</p>

# 🎬 Reelcrit

> A sleek movie review platform with Spring Boot backend and React frontend

[![Live Demo](https://img.shields.io/badge/demo-online-green.svg)](https://reelcrit.vercel.app)
[![API Docs](https://img.shields.io/badge/api-swagger-blue.svg)](https://reelcrit-backend.onrender.com/swagger-ui/index.html)
[![Java](https://img.shields.io/badge/java-17-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/spring_boot-3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

## ✨ Features

- 🔐 **JWT Authentication** - Secure user accounts
- 🎭 **Movie Reviews** - Create, read, update, and delete reviews
- ⭐ **Ratings** - Rate your favorite movies
- 🔍 **Search & Filter** - Find exactly what you're looking for
- 📱 **Responsive Design** - Works on all devices

## 🚀 Quick Start

```bash
# Clone the repo
git clone https://github.com/Himansyou/reelcrit.git

# Navigate to directory
cd reelcrit

# Install dependencies & run
mvn clean install
mvn spring-boot:run
```

## 🐳 Docker

```bash
docker build -t reelcrit-backend .
docker run -p 8080:8080 --env-file .env reelcrit-backend
```

## 🔌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/auth/register` | Register new user |
| `POST` | `/api/auth/login` | Login and get token |
| `GET`  | `/api/movies` | Get all movies |
| `GET`  | `/api/movies/{id}` | Get movie details |
| `GET`  | `/api/reviews/movie/{movieId}` | Get movie reviews |
| `POST` | `/api/reviews` | Create review |

## 🛠️ Tech Stack

- **Backend**: Java 17, Spring Boot 3, JWT, PostgreSQL
- **Deployment**: Docker, Render
- **Documentation**: Swagger/OpenAPI

## 🔗 Links

- 🌐 **Frontend**: [reelcrit.vercel.app](https://reelcrit.vercel.app)
- 🔙 **Backend**: [reelcrit-backend.onrender.com](https://reelcrit-backend.onrender.com)
- 📖 **API Docs**: [Swagger UI](https://reelcrit-backend.onrender.com/swagger-ui/index.html)

## 👨‍💻 Connect

- **Creator**: [Himanshu](https://github.com/Himansyou)
- **Repository**: [github.com/Himansyou/reelcrit](https://github.com/Himansyou/reelcrit)

---

<p align="center">
  <sub>Built with ❤️ by <a href="https://github.com/Himansyou">Himanshu</a></sub>
</p>
