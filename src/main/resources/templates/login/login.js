
const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');
const name=document .querySelector('.name');
const email=document.querySelector('.email');
const password = document .querySelector('.password');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});

const form =document.querySelector('.account_form');
function sendmsg(e){
	e.preventDefault();


Email.send({
    SecureToken : "e56fdee4-eb0b-4404-8e51-8b61d4e0ce6e",
    To : email.value,
    From : "parc.auto.ommp@gmail.com",
    Subject : "welcome with us",
    Body : "welcome friend "(name.value) 
}).then(
  message => alert(message)
);
form.addEventListener('submit',sendmsg);}


