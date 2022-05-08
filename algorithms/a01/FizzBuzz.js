function fizzBuzz(n) {
        switch(true) {
                case(n % 3 === 0 && n % 5 === 0):
                    console.log("FizzBuzz");
                    break;
                case(n % 5 === 0):
                    console.log("Buzz");
                    break;
                case(n % 3 === 0):
                    console.log("Fizz");
                    break;
                default:
                    console.log(n);
    }
}
fizzBuzz(3)
fizzBuzz(5)
fizzBuzz(45)
