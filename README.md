# imgui-mc
ImGui for minecraft based on imgui-java

**The currently supported Minecraft version is 1.21.1. Support for previous versions will no longer be provided.**

## TODO:

- Stop mouse input to imgui while in game
- Wiki
- Add more stuff to this todo list

## Maven repo

### 1.0.3 and below
```groovy
   maven {
        name = "breadloaf.public"
        url = "https://maven.breadloaf.xyz/repository/public"
    }
```

### 1.0.6 and above
```groovy
    maven {
        name = "AlignedCookie88"
        url = "https://repo.alignedcookie88.com/repository/maven-public/"
    }
```

## dependencies
```groovy
modImplementation "xyz.breadloaf.imguimc:imgui-mc:${project.imguimc_version}"
```

## fabric.mod.json
```json
...
"depends": {
    ...
    "imguimc": "${imguimc_version}",
}
...
```

## Current versions

| MC version | imguimc version | imgui-java version                                                  |
|------------|-----------------| ------------------------------------------------------------------- |
| 1.17.1     | 1.17.1-1.0.3    | [1.84.1.1](https://github.com/SpaiR/imgui-java/releases/tag/v1.84.1.1) |
| 1.20.4     | 1.20.4-1.0.4    | [1.84.1.1](https://github.com/SpaiR/imgui-java/releases/tag/v1.84.1.1) |
| 1.20.4     | 1.20.4-1.0.5    | [1.84.1.1](https://github.com/SpaiR/imgui-java/releases/tag/v1.84.1.1) |
| 1.20.4     | 1.20.4-1.0.6    | [1.84.1.1](https://github.com/SpaiR/imgui-java/releases/tag/v1.84.1.1) |
| 1.20.4     | 1.20.4-1.0.7    | [1.86.12](https://github.com/SpaiR/imgui-java/releases/tag/1.86.12) |
| 1.21.1     | 1.21.1-1.0.7    | [1.86.12](https://github.com/SpaiR/imgui-java/releases/tag/1.86.12) |
| 1.21.1     | 1.21.1-1.0.8    | [1.86.12](https://github.com/SpaiR/imgui-java/releases/tag/1.86.12) |
| 1.21.3     | 1.21.3-1.0.9    | [1.86.12](https://github.com/SpaiR/imgui-java/releases/tag/1.86.12) |
| 1.21.3     | 1.21.3-1.1.0    | [1.86.12](https://github.com/SpaiR/imgui-java/releases/tag/1.86.12) |
| 1.21.4     | 1.21.4-1.1.0    | [1.86.12](https://github.com/SpaiR/imgui-java/releases/tag/1.86.12) |


## Features

Use the same familiar imgui interface your used to create a multi window interface in minecraft! (+ screen api for easier development)

### Extensions:

- ImNodes
  
    A small, dependency-free node editor for dear imgui. (A good choice for simple start.)
- imgui-node-editor
  
    Node Editor using ImGui. (A bit more complex than ImNodes, but has more features.)
- ImGuizmo
  
    Immediate mode 3D gizmo for scene editing and other controls based on Dear Imgui.
- implot
  
    Advanced 2D Plotting for Dear ImGui.
- ImGuiColorTextEdit
  
    Syntax highlighting text editor for ImGui.

## Examples

Using ImGuizmo to provide basic 3D tools in game.
![Example showing 3D modeling tools in game](https://i.imgur.com/y65sWyQ.png)


Example showing window dragging
![GIF showing window dragging](https://cdn.discordapp.com/attachments/854660703742328884/886957812725452800/Peek_2021-09-13_13-44.gif)
