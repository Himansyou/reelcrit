
  <img src="https://github.com/user-attachments/assets/b33290cd-b45a-4781-b72b-d9e154630e4e" alt="Reelcrit Logo" height="300" width="900"/>
</p>

<h1 align="center"> [🎬 Reelcrit - Backend](https://reelcrit.onrender.com)</h1>

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
| `GET` | `/auth/health/ping-db` | Checks if MySQL DB is alive |
🎬 Movies/Series API
| `GET` | `/auth/movies/search/{name}` | Search movies/series by name |
| `GET`  | `/auth/movies/reviews/{id}` | Get reviews for a specific Movie/Series (by ID)|
| `GET`  | `/auth/movies/{type}/{id}` | 	Get detailed info of movie/show by type & ID |
| `GET`  | `/auth/movies/popular` | Get trending Series/Movie |
📝 Reviews API
| `POST` | `/api/Reviews/add` | 	Add a new review |
👤 Users API
| `POST` | `/api/Users/create` | Create a new user |
| `POST` | `/api/Users/{id}` | 	Get user details by user ID |
| `POST` | `/api/Users/{userId}/reviews` | Get reviews submitted by a user |


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
