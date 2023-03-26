package bitwiseOperators;

public class IthBit {
    // binary num = 1010101011;

    // have to find value of bit any place
    // if we & 1 with that bit val it remains the same
    // ans = num & (1 << n-1), n is the position

    // have to set any bit value to 1
    // if we | 1 with that val will get the compliment of that
    // ans = num | (1 << n-1), n is the position

    // have to reset any bit val
    // if we & 0 with that val will get that compliment
    // ans = num & !(1 << n-1), n is the position
}
