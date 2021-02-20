## Preamble

Run and test java code in **milliseconds**.

This works by leveraging a very cool project: [GroovyServ](https://kobo.github.io/groovyserv/quickstart.html).

And using `Groovy` as an entrypoint for `Java` focused development.

---

## Requirements

Linux only for now.

MacOS would need a specific file watcher. Apart from that everything should work the same.

For Windows, WSL should make things work.

---

## How to use

### Step 1: start a watch process in a separate terminal

```bash
./manage/dev/watch
```

### Step 2: launch the dev entrypoint

```bash
./manage/dev/run
```

Or test some Java code via Groovy's test infrastructure:

```bash
./manage/dev/test-run ./test/tools/WorkersTest.groovy
```
