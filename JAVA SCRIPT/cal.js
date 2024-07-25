const display = document.querySelector('.box');
const buttons = document.querySelectorAll('button');

buttons.forEach(button => {
    button.onclick = function() {
        const value = button.textContent;
        
        if (value === 'C') {
            clearDisplay();
        } else if (value === '=') {
            calculateResult();
        } else if (value === '=>') {
            backspace();
        } else {
            appendCharacter(value);
        }
    };
});

function clearDisplay() {
    display.textContent = '';
}

function appendCharacter(char) {
    display.textContent += char;
}

function backspace() {
    display.textContent = display.textContent.slice(0, -1);
}

function calculateResult() {
    try {
        display.textContent = eval(display.textContent.replace('%', '/100'));
    } catch (e) {
        display.textContent = 'Error';
    }
}
