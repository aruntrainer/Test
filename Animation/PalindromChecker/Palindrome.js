function checkPalindrome(string) {

    const len = string.length;

    for (let i = 0; i < len / 2; i++) {

        if (string[i] !== string[len - 1 - i]) {
            return 'It is not a Palindrome';
        }
    }
    return 'It is a Palindrome';
}


function Palindrome_function(){
    var data = document.getElementById("input").value;
    const ans = checkPalindrome(data);
    document.getElementById("ans").innerHTML = ans;
  }