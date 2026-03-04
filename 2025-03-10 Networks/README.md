# ☕ Lab Session — March 10, 2025

**Topic:** Java Networking — Sockets & Client-Server

## Concepts Covered

- Networking basics: IP addresses, ports, TCP vs UDP
- `java.net` package overview
- **`Socket`** — client-side TCP connection
- **`ServerSocket`** — server-side listener
- Client-Server architecture in Java
- Sending and receiving data over a socket using I/O streams
- Handling multiple clients with threads
- `InetAddress` — resolving hostnames and IP addresses
- `URL` and `URLConnection` — making HTTP requests

## Client-Server Model

```
Server                          Client
  |                               |
ServerSocket(port)            Socket(host, port)
  |                               |
accept() ←───────────────── connect()
  |                               |
getInputStream()            getOutputStream()
getOutputStream()           getInputStream()
  |                               |
 read / write ↔──────── write / read
```

## Key Takeaway

Java sockets let two programs communicate over a network using **TCP streams** — once connected, they communicate via `InputStream` and `OutputStream`, exactly like file I/O.

## Root-Level Files

The `Client.java` and `Validator.java` files in the repo root are related to this networking lab.

## How to Run

```bash
# Terminal 1 - Start server
javac Server.java && java Server

# Terminal 2 - Start client
javac Client.java && java Client
```
