# CSA09 – Programming in Java – Assignment 2 (CO2)

**Student:** Steffi I  
**Register number:** 192524480  
**Java:** JDK 17+ recommended  
**Repository:** https://github.com/192524480simats-lab/CSA0909-192524480-Assignment2

This repository follows the supplied Assignment 2 PDF: Q1 Strings, Q2 List/Deque, Q3 hashCode–equals, Q4 Maps, Q5 Generics/Comparator, Q6 PriorityQueue and Q7 Diagnose–Redesign–Validate.

## Tasks and files

| Question | Folder | Main program |
|---|---|---|
| Q1 – String, StringBuilder, StringBuffer | [Task01](Task01/) | TicketBenchmark.java |
| Q2 – ArrayList, LinkedList, ArrayDeque | [Task02](Task02/) | PlaylistBenchmark.java |
| Q3 – HashSet and hashCode–equals | [Task03](Task03/) | Attendance.java |
| Q4 – HashMap, TreeMap, LinkedHashMap | [Task04](Task04/) | PharmacyMaps.java |
| Q5 – Generics, Comparable, Comparator | [Task05](Task05/) | LeaderboardDemo.java |
| Q6 – Queue and PriorityQueue | [Task06](Task06/) | Triage.java |
| Q7 – Diagnose, redesign and validate | [Task07](Task07/) | AttendanceRedesign.java |

Each task folder contains its source, design notes and a CSV file for recording measured results. Add your own console/output screenshots to the matching folder after running the programs.

## Compile and run

Open Command Prompt in the task folder, then run:

```bash
javac FileName.java
java ClassName
```

Example for Q1:

```bash
cd Task01
javac TicketBenchmark.java
java TicketBenchmark
```

Repeat for each task using the main class shown in the table.

## Important experimental requirements

- Run each benchmark repeatedly on the same computer and under comparable conditions.
- Keep raw measurements; calculate averages from repeated runs.
- Use at least three data sizes where the question requires growth testing.
- Do not invent or copy timing values. Timing depends on hardware, JVM warm-up, operating system and background load.
- Q1: test short, large (e.g. 10,000 tickets × 50 fields) and one self-designed workload.
- Q2: test at least three playlist sizes and all requested operations.
- Q4: test at least three medicine counts and 100,000 lookups.
- Q6: test at least three queue sizes.
- Q7: record original and redesigned measurements under the same conditions.
- Include the screenshots and raw data in this repository before submission.

## Assignment evidence checklist

- [ ] Execute every Java program, including completed-code tasks.
- [ ] Save input and output screenshots in the matching task folder.
- [ ] Fill each measurements CSV using your own repeated runs.
- [ ] Include the Q7 diagnosis, measurable objective, prediction, design, validation and final decision.
- [ ] Commit progressively, at least one meaningful commit per task.
- [ ] Share this repository with course faculty.

**Note:** Source code and experiment templates are provided. Local execution, screenshots and measured results are not claimed until you run them yourself.
