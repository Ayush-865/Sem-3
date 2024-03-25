function showNextSection() {
    document.getElementById('additionalInfo').classList.remove('hidden');
}

function showPreviousSection() {
    document.getElementById('additionalInfo').classList.add('hidden');
}

document.getElementById('myForm').addEventListener('submit', function (event) {
    var isValid = validateForm();
    if (!isValid) {
        event.preventDefault();
    }
});

function validateForm() {
    var fullName = document.getElementById('fullName').value;
    var username = document.getElementById('username').value;
    var email = document.getElementById('email').value;
    var phone = document.getElementById('phone').value;
    var dob = document.getElementById('dob').value;
    var password = document.getElementById('password').value;
    var confirmPassword = document.getElementById('confirmPassword').value;
    var gender = document.querySelector('input[name="gender"]:checked');
    var city = document.getElementById('city').value;
    var nationality = document.getElementById('nationality').value;
    var address = document.getElementById('address').value;
    var fatherName = document.getElementById('fatherName').value;
    var motherName = document.getElementById('motherName').value;
    if (fullName === '') {
        alert('Please enter your full name.');
        return false;
    }
    if (username === '') {
        alert('Please enter a username.');
        return false;
    }
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert('Please enter a valid email address.');
        return false;
    }
    var phoneRegex = /^\d{10}$/;
    if (!phoneRegex.test(phone)) {
        alert('Please enter a valid 10-digit phone number.');
        return false;
    }
    if (dob === '') {
        alert('Please enter your date of birth.');
        return false;
    }
    if (password === '') {
        alert('Please enter a password.');
        return false;
    }
    if (confirmPassword === '' || confirmPassword !== password) {
        alert('Passwords do not match.');
        return false;
    }
    if (!gender) {
        alert('Please select your gender.');
        return false;
    }
    if (city === '') {
        alert('Please select your city.');
        return false;
    }
    if (nationality === '') {
        alert('Please select your nationality.');
        return false;
    }
    if (address === '') {
        alert('Please enter your address.');
        return false;
    }
    if (fatherName === '') {
        alert('Please enter your father\'s name.');
        return false;
    }
    if (motherName === '') {
        alert('Please enter your mother\'s name.');
        return false;
    }
    return true;
}
