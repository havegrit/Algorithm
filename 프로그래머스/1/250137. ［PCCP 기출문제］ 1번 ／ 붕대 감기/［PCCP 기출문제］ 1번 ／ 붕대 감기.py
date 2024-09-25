def solution(bandage, health, attacks):
    answer = 0
    
    time = 0
    bandageSuccessDuration = 0
    attackPhase = 0
    bandageSuccessTime = bandage[0]
    healAmountPerSec = bandage[1]
    additionalHealAmount = bandage[2]
    maxHealth = health
    
    while True:
        if attackPhase == len(attacks):
            break
        
        attackTime = attacks[attackPhase][0]
        damage = attacks[attackPhase][1]
        healAmount = healAmountPerSec
        
        if attackTime == time:
            bandageSuccessDuration = 0
            health -= damage
            attackPhase += 1
            
        else:
            bandageSuccessDuration += 1
            if bandageSuccessDuration == bandageSuccessTime:
                healAmount += additionalHealAmount
                bandageSuccessDuration = 0
            health += healAmount
        
        if health <= 0:
            return -1
        elif health > maxHealth:
            health = maxHealth
        
        time += 1
    
    return health