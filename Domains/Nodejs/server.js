const crypto = require("crypto");

for (let i = 0; i < 10000; i++) {
  crypto.pbkdf2("password", "salt", 100000, 64, "sha512", () => {
  });

}

console.log("Hashing is executed by cpu on process, this statement is working in the main thread")





/*
  ⚡ Explanation of CPU usage:
  -console is done in main thread  , heavy load send to cpu using libuv thread pool
  - By default, libuv (used internally by Node.js) creates a threadpool of 4 threads.
  - These 4 threads handle all heavy async work like crypto, fs, dns, etc.
  - In this example, 10,000 PBKDF2 tasks are queued.
  - They are distributed across 4 threads → so all 4 CPU cores get busy.
  - That’s why you often see ~400% CPU usage (4 cores fully utilized).
  - If you want more concurrency, you can increase threadpool size, e.g.:

        UV_THREADPOOL_SIZE=8 node script.js

    → This would use up to 8 threads instead of 4.
*/