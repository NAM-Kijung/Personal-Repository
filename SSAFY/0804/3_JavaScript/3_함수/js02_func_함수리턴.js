function func() {
  return function (num1, num2) {
    return num1 + num2;
  };
}

function func2() {}

let callFn = func();
let result = callFn(100, 200);
console.log(result);

console.log(func2()); // undefined 출력
