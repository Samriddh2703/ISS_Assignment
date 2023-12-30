function validateForm() {
    var fullName = document.getElementById("fullName").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    var gender = document.querySelector('input[name="gender"]:checked');
    var interests = document.querySelectorAll('input[type="checkbox"]:checked');
    var country = document.getElementById("country").value;

    // Simple validation example
    if (fullName === "" || email === "" || password === "" || !gender || interests.length === 0 || country === "") {
        alert("Please fill out all fields and make a selection for gender, interests, and country");
        return false;
    }

    // You can add more complex validation logic here

    // If the form is valid, you can submit it or perform other actions
    alert("Form submitted successfully!");
}
