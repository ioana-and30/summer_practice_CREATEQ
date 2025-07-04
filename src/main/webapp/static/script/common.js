 window.onload = function () {
    const footer = document.getElementById("footer-text");
    const today = new Date().toLocaleDateString("ro-RO");
    footer.innerText += " | Data: " + today;
};



