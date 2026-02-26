# FPL-Pulse
FPL live game week event streaming and mini-league tracker


## What I'm building

A system that polls the FPL API every 60 seconds during a gameweek, detects player stat changes (goals, assists, cards, bonus points), publishes them as typed events to Kafka, and uses consumers to compute live mini-league standings that get pushed to a browser in real time.