const sentence = "this is a sunday";
console.log("given input - "+"  " +sentence);
const reversesentence=sentence=>{
   const arr=sentence.split(" ");
   const reversed=arr.map(e1 =>{
      return e1.split('').reverse().join("");
     
   })
   return reversed.join(" ");
}
console.log("reversed input - "+reversesentence(sentence));


