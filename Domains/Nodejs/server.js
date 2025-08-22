const crypto = require("crypto");

for (let i = 0; i < 10000; i++) {
  crypto.pbkdf2("password", "salt", 100000, 64, "sha512", () => {
  });

}

console.log("Hashing is executed by cpu on process, this statement is working in the main thread")