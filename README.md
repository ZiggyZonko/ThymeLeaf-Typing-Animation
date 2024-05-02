# 🍃 ThymeLeaf Typing Animation

**🏠Background**

ThymeLeaf is a HTML Library that depends on the Spring Boot framework and makes making stylish websites with spring boot easier, implmenting HTML, CSS and Javascript. These Key Components make for a more reactive and easy going webpage made with spring Boot.

**💻Code Explanation**

The CSS code that makes the animation is actually not in the main.css file but in the HTML File itself and creates a keyframe of a solid white line flashing evrey .75 seconds and moves along to create a typing effect revealing the word.

```
.typewriter h1 {
        overflow: hidden; /* Ensures the content is not revealed until the animation */
        border-right: .15em solid white; /* The typwriter cursor */
        white-space: nowrap; /* Keeps the content on a single line */
        margin: 0 auto; /* Gives that scrolling effect as the typing happens */
        letter-spacing: .15em; /* Adjust as needed */
        animation:
        typing 1s steps(10, end),
        blink-caret .75s step-end infinite;
    }
  
    /* The typing effect */
    @keyframes typing {
        from { width: 0 }
        to { width: 100% }
    }
  
    /* The typewriter cursor effect */
    @keyframes blink-caret {
        from, to { border-color: transparent }
        50% { border-color: white; }
    }
```

This is what the main css looks like and you can modify it how ever you want. To change the character per second change the steps number value to a higher or lower. I've made it 10 character per second as the word is ten characters which means it will take a second to reveal.

*🛠️*Requirements**
For this project you need to install a few things if you haven't already. The Spring Boot dependencies are already installed in the package but if you would like to create your own project, head over to [start.spring.io](https://start.spring.io).

You will need...
- Gradle
- JVM, JDK and JRE (This Version is Recommended to use Java 21 with Gradle 8.7 - The Latest Version as of right now.)

**🐛Common Error**

``` > BUG! exception in phase 'semantic analysis' in source unit '_BuildScript_' Unsupported class file major version 66 ```

If you get this error or a similar error it means you are not using the correct java for gradle version. If you get this speific error it is most likely because you are using JDK 22 which is not supported by Gradle Yet. I recommend using Java 17 or Java 22 (JDK)

🛠️ Feel Free to make an issue if you need any help 🛠️

👋-----Thanks for stopping by------👋
