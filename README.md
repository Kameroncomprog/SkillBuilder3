
# Skill Builder 3 - Defining Classes and Methods

## Learning Outcomes

By the end of this activity, a student should be able to:

1. Implement a simple Java class.
2. Include and use static fields.
3. Implement accessor and mutator methods
4. Design objects that interact with each other.

## The Grok Coalition

Your studio is building a new title featuring the **Grok**, a hungry little creature with a massive appetite for energy. But before we can launch the Grok into the world, we need to build its fuel source.

**The Mission:** You are tasked with engineering the PowerPill class. Think of this as the "battery" for your character. In this stage, you will define how much energy a pill holds and how it interacts with the world. Later on, we will drop the Grok into the mix to start the feeding frenzy!

## The PowerPill Class

Before the Grok can roam the digital wasteland, it needs a power grid. A PowerPill isn't just an object; it’s a discrete unit of energy waiting to be harvested.

Your objective is to build a flexible class that allows a "Client" (the game engine) to manufacture a wide variety of pills—from low-level "Zaps" to legendary "Overloads."

A PowerPill is a collectible object that the Grok will eventually ingest to boost its stats. As the developer, you need to ensure the game engine can create pills with varying names and potency levels.

```java
/**
 * PowerPill.java 
 * The primary energy source for the Grok species.
 */
public class PowerPill {
    // Your implementation goes here
}
```

## Implementation Sprint (Required Activities)

You are to implement the following in the `PowerPill` class.

1. Add a ***static*** integer field called `DEFAULT_POWER` and set it to 10. (**NOTE: static variables can be initialized outside of constructors, but NOT INSTANCE variables!**)
2. Add an integer field called `power`.
3. Add a String field called `name`.
4. Add a value constructor with a string parameter called `name`.  Add the javadoc comment below before the constructor name.
     <pre>
     /**
     * Initializes this power pill to a default power value
     * and sets the name of the pill to name.
     * @param name the name of this power pill.
     */
     </pre>
5. Add a value constructor where the first parameter is a string called `name` and the second parameter is an integer called `power`.

	<pre>
     /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
	</pre>

6. Add getter methods with an appropriate javadoc comment for each method.
7. Add setter methods with an appropriate javadoc comment for each method.
8. Add a `toString` method that returns a string formatted as,
   
   <pre>
   PowerPill &lt;name&gt; = &lt;power&gt;
   </pre>
   
   where `<name>` is replaced by the PowerPill object's name and <br>
         `<power>` is replaced with the PowerPill object's power

For example,

```
PowerPill p = new PowerPill("Pink", 20);
System.out.println(p);
```

results in,

```
PowerPill Pink = 20
```

## System Integration (Usage Example)

An example of how the class may be used is,

```java
PowerPill bluePill = new PowerPill("Blue");
PowerPill redPill = new PowerPill("Red", 40);

int bluePower = bluePill.staticgetPower();
int redpower = redPill.staticgetPower();

```

## 🧪 Testing & Debugging Strategy

### ⚠️ Resolving Syntax Errors

When you first open `PowerPillTest`, it will likely be full of errors. **Don't panic.** This is because the test file is looking for methods you haven't written yet. As you complete the requirements, the errors in `PowerPillTest` will resolve.

### 🐛 The Debugger is Your Best Friend

If a test fails, don't just guess!

1. **Set a Breakpoint:** Click the margin next to the line number where the failure occurs.
2. **Run Symbolic Debugger:** Watch your variables change in real-time to find exactly where the logic breaks.
3. **Verify Constructors:** If your getters are failing, your constructors likely aren't assigning values correctly.

## Submission

**The pull request is the submission.** Nothing gets uploaded anywhere. And it has to be a pull
request **in your own fork** — committed is not submitted, and pushed is not submitted either.

The full walkthrough, with every error message:
[Git — pull it down, hand it in](https://github.com/DSU-CSCI-121-F26/recitation-notes/blob/main/git-workflow.md).

### 1 · Fork — not *Use this template*

At the top of this page: **Fork** → **Create fork**.

> **⚠️ Do not click the green _Use this template_ button.** That makes a copy that is not a fork,
> and if it is private I cannot see it — so as far as grading is concerned, you never started.

The URL becomes `github.com/`**`your-username`**`/SkillBuilder3`. **That is how you know it
worked.**

### 2 · Clone **your** fork

Green **Code** button on **your** fork → **HTTPS** → copy.

```bash
git clone https://github.com/your-username/SkillBuilder3.git
cd SkillBuilder3
git remote -v          # must say YOUR username, not DSU-CSCI-121-F26
```

**Read what `git remote -v` prints.** If it says `DSU-CSCI-121-F26`, you cloned my copy, and your
push will fail with `Permission denied`. Fix it without losing anything:

```bash
git remote set-url origin https://github.com/your-username/SkillBuilder3.git
```

### 3 · Branch, then commit and push as you go

```bash
git switch -c assignment             # BEFORE you write anything — never work on main
./mvnw test                          # mvnw.cmd test on Windows
git add -A && git commit -m "..."    # small commits, real messages, as you go
git push -u origin assignment        # after the first time, just: git push
```

**`Authentication failed` is always the token.** Your GitHub password does not work for pushing.
GitHub → **Settings** → **Developer settings** → **Personal access tokens** → **Tokens (classic)**
→ **Generate new token** → check **`repo`** → **Generate**. Copy it immediately — it is shown once
— and paste it where Git asks for the password.

### 4 · Open the pull request — in **your** fork

Reload your fork → **Compare & pull request**.

> **⚠️ GitHub sets the base repository to `DSU-CSCI-121-F26/SkillBuilder3` by default. Change it
> to yours.** Before you click **Create**, read the sentence GitHub prints. Your username has to be
> on **both** sides:
>
> **`your-username`** wants to merge N commits into **`your-username:main`** from
> **`your-username:assignment`**
>
> A pull request opened against `DSU-CSCI-121-F26` is not a submission.

Then: **Create pull request** → **leave it open, do not merge it** → **Actions** tab → *I
understand my workflows, go ahead and enable them* (without this your PR never gets a check) →
**post the PR link in Canvas.**

### Submit early — red is fine

Open the PR as soon as your **skeleton methods** compile, with the tests still red. From then on,
every `git push` updates **the same pull request** by itself — never open a second one. On the night
it is due, there is nothing left to go wrong except the Java.

Your commit history is part of what is graded — incremental work with real messages, not
one dump at the deadline.

<span style="font-size:2em;color:green;">Happy Coding!</span>