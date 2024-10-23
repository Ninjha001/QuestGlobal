document.getElementById("form").addEventListener("submit", function (e) {
    e.preventDefault(); 

    const form = e.target;
    const name = form.querySelector("#name");
    const email = form.querySelector("#email");
    const message = form.querySelector("#message");
    const formResult = document.getElementById("form-result");

    formResult.classList.add("hidden");
    formResult.style.opacity = "0";


    if (!form.checkValidity()) {
        if (!name.validity.valid) {
            alert(name.title); 
            name.focus();
            return;
        }
        if (!email.validity.valid) {
            alert("Please enter a valid email address.");
            email.focus();
            return;
        }
        if (!message.validity.valid) {
            alert("Message cannot be empty.");
            message.focus();
            return;
        }
    }

    formResult.classList.remove("hidden");
    formResult.style.opacity = "1";

    
    setTimeout(() => {
        window.location.href = "thank-you.html";
    }, 2000);
});

