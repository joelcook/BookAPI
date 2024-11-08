# Book Management REST API

This is a simple Book Management REST API built with Spring Boot. It allows you to create, retrieve, update, and delete books in an in-memory repository.

## Environment

- **Java**: 17 or higher
- **Spring Boot**: 3.3.5
- **Build Tool**: Gradle

Make sure you have Java 17 or higher installed. If you need to check your Java version, you can run:

```bash
java -version
```
# All the code is under following folder
BookAPI/src/main/java/com/example/demo/

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd demo
   ```

2. **Build the Project**:
   ```bash
   ./gradlew clean build
   ```

3. **Run the Application**:
   You can run the application using either of the following commands:

   - **Using Gradle**:
     ```bash
     ./gradlew bootRun
     ```

The application will start on `http://localhost:8080`.

## API Endpoints

Here are the available API endpoints with example `curl` commands.

### 1. Retrieve a List of All Books

**Endpoint**: `GET /books`

```bash
curl -X GET http://localhost:8080/books
```

### 2. Retrieve a Single Book by ID

**Endpoint**: `GET /books/{id}`

Replace `{id}` with the UUID of the book you want to retrieve.

```bash
curl -X GET http://localhost:8080/books/{id}
```

Example:
```bash
curl -X GET http://localhost:8080/books/123e4567-e89b-12d3-a456-426614174000
```

### 3. Add a New Book

**Endpoint**: `POST /books`

The request body should contain the book's details (`title`, `author`, and `isbn`).

```bash
curl -X POST http://localhost:8080/books \
-H "Content-Type: application/json" \
-d '{
  "title": "Sample Book",
  "author": "John Doe",
  "isbn": "123-4567890123"
}'
```

### 4. Update an Existing Book by ID

**Endpoint**: `PUT /books/{id}`

Replace `{id}` with the UUID of the book you want to update. The request body should contain the updated book details (`title`, `author`, and `isbn`).

```bash
curl -X PUT http://localhost:8080/books/{id} \
-H "Content-Type: application/json" \
-d '{
  "title": "Updated Book Title",
  "author": "Jane Doe",
  "isbn": "987-6543210987"
}'
```

Example:
```bash
curl -X PUT http://localhost:8080/books/123e4567-e89b-12d3-a456-426614174000 \
-H "Content-Type: application/json" \
-d '{
  "title": "Updated Book Title",
  "author": "Jane Doe",
  "isbn": "987-6543210987"
}'
```

### 5. Delete a Book by ID

**Endpoint**: `DELETE /books/{id}`

Replace `{id}` with the UUID of the book you want to delete.

```bash
curl -X DELETE http://localhost:8080/books/{id}
```

Example:
```bash
curl -X DELETE http://localhost:8080/books/123e4567-e89b-12d3-a456-426614174000
```

---

## Additional Notes

- **In-Memory Storage**: This application uses an in-memory `Map` to store book data, so all data will be lost when the application restarts.
- **Validation**: The `POST` and `PUT` endpoints validate that `title`, `author`, and `isbn` fields are not empty.

---
