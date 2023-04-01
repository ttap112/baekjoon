hour, minute = map(int, input().split())
duration = int(input())
total_minutes = hour * 60 + minute + duration
end_hour = total_minutes // 60
end_minute = total_minutes % 60
if end_hour >= 24:
    end_hour -= 24
if end_minute >= 60:
    end_minute -= 60
print(end_hour, end_minute)