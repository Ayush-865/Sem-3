document.addEventListener("DOMContentLoaded", function () {
    const contactForm = document.getElementById('contactForm');

    function handleSubmit(event) {
        event.preventDefault();

        const usernameInput = document.getElementById('username');
        const emailInput = document.getElementById('email');
        const phoneInput = document.getElementById('phone');
        const messageInput = document.getElementById('message');

        const username = usernameInput.value.trim();
        const email = emailInput.value.trim();
        const phone = phoneInput.value.trim();
        const message = messageInput.value.trim();

        if (username === '') {
            alert('Please enter your name.');
            return;
        }

        if (email === '') {
            alert('Please enter your email.');
            return;
        } else if (!isValidEmail(email)) {
            alert('Please enter a valid email address.');
            return;
        }

        if (phone === '') {
            alert('Please enter your phone number.');
            return;
        } else if (!isValidPhone(phone)) {
            alert('Please enter a valid phone number.');
            return;
        }

        if (message === '') {
            alert('Please enter your message.');
            return;
        }

        alert(`Form Data:\nName: ${username}\nEmail: ${email}\nPhone: ${phone}\nMessage: ${message}`);
    }

    function isValidEmail(email) {
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailRegex.test(email);
    }

    function isValidPhone(phone) {
        const phoneRegex = /^[0-9]{10}$/;
        return phoneRegex.test(phone);
    }

    contactForm.addEventListener('submit', handleSubmit);
});
