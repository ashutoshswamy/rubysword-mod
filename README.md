# My Mod (Ruby Sword)

A Fabric mod for **Minecraft 1.21.1** that adds a custom **Ruby Sword**.

## Features

- Adds `mymod:ruby_sword`
- Ruby Sword uses Netherite durability/material stats
- Applies fire to hit targets for 5 seconds
- Includes a shaped crafting recipe:
  - `R` = `minecraft:redstone_block`
  - `B` = `minecraft:blaze_rod`

Pattern:

```text
R
R
B
```

## Tech Stack

- Minecraft: `1.21.1`
- Fabric Loader: `0.16.10`
- Fabric API: `0.116.6+1.21.1`
- Yarn mappings: `1.21.1+build.3`
- Java: `21`
- Build tool: `Gradle` + `fabric-loom`

## Project Structure

```text
src/main/java/com/ashu/mymod/
  MyMod.java
  item/
    ModItems.java
    RubySwordItem.java

src/main/resources/
  fabric.mod.json
  assets/mymod/
    icon.png
    lang/en_us.json
    models/item/ruby_sword.json
    textures/item/ruby_sword.png
  data/mymod/
    recipes/ruby_sword.json
```

## Getting Started

### Prerequisites

- JDK 21 installed
- Git (optional, for cloning/pushing)

### Run in Development

```bash
./gradlew runClient
```

### Build the Mod JAR

```bash
./gradlew build
```

Built artifacts will be in:

```text
build/libs/
```

## GitHub Push Checklist

1. Initialize/verify git:
   ```bash
   git status
   ```
2. Add files:
   ```bash
   git add .
   ```
3. Commit:
   ```bash
   git commit -m "Initial Fabric mod setup"
   ```
4. Add remote:
   ```bash
   git remote add origin <your-repo-url>
   ```
5. Push:
   ```bash
   git push -u origin main
   ```

## License

Current mod metadata sets license to `All-Rights-Reserved` in `fabric.mod.json`.
