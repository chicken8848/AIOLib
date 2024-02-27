module alu_16_tb();

localparam WIDTH = 16;
localparam DURATION = 100000;

reg [WIDTH-1:0] reg1;
reg [WIDTH-1:0] reg2;
reg [5:0] alu_fn;
wire z_out;
wire v_out;
wire n_out;
wire [WIDTH-1:0] result;

alu_16 #(.WIDTH(WIDTH)) alu0 (
  .a(reg1),
  .b(reg2),
  .alufn(alu_fn),
  .out(result),
  .z(z_out),
  .v(v_out),
  .n(n_out)
);

initial begin
  // check ADD 0x00
  alu_fn = 0;
  // two positive numbers
  reg1 = 'h0101; 
  reg2 = 'h0011;
  #10;
  // zero addition
  reg1 = 0; 
  reg2 = 'h7FFF;
  #10;
  reg1 = 'h7FFF;
  reg2 = 0;
  #10;
  // boundary values
  reg1 = 'h7FFF; 
  reg2 = 'h7FFF;
  #10;
  // Check SUB 0x01
  alu_fn = 6'b000001;
  // zero subtraction
  reg1 = 0; 
  reg2 = 'h0101;
  #10;
  reg1 = 'h0101;
  reg2 = 0;
  #10;
  // underflow check
  reg1 = 'h7FFF; 
  reg2 = 'h0A32;
  #10;
  // boundary values
  reg1 = 0; 
  reg2 = 'h7FFF;
  #10;
  // Check multiplication
  alu_fn = 6'b000010;
  // mult by zero
  reg1 = 0; 
  reg2 = 0;
  #10;
  // mult by 1
  reg1 = 1;
  reg2 = 'h3321;
  #10;
  reg1 = 'h3321;
  reg2 = 'h0476;
  #10;
  // check mulhu
  alu_fn = 6'b000011;
  reg1 = 'h3321;
  reg2 = 'h0476;
  #10;
  // Check AND
  alu_fn = 'h18;
  // zeroes and ones
  reg1 = 'h1234;
  reg2 = 0;
  #10;
  reg1 = 'h1234;
  reg2 = 'hFFFF;
  #10;
  // Identity check
  reg1 = 'h1234;
  reg2 = 'h1234;
  #10;
  // Complmeent check
  reg1 = 'h1234;
  reg2 = ~reg1;
  #10;
  // Check OR
  alu_fn = 'h1E;
  // zeroes and ones
  reg1 = 'h1234;
  reg2 = 0;
  #10;
  reg1 = 'h1234;
  reg2 = 'hFFFF;
  #10;
  // identity check
  reg1 = 'h1234;
  reg2 = 'h1234;
  #10;
  // Check XOR
  alu_fn = 'h16;
  // identity check
  reg1 = 'hABCD;
  reg2 = 0;
  #10;
  reg1 = 'hABCD;
  reg2 = 'hABCD;
  #10;
  // Check A bypass
  alu_fn = 'h1A;
  reg1 = 'h0871;
  reg2 = 'hFFFF;
  #10;
  // check shl
  alu_fn = 'h20;
  // shift by zero
  reg1 = 'h0871;
  reg2 = 0;
  #10;
  // max shift
  reg1 = 'h0871;
  reg2 = 'h0007;
  #10;
  // boundary case
  reg1 = 'hFFFF;
  reg2 = 'h0000;
  #10;
  // check SHR
  alu_fn = 'h21;
  // max shift
  reg1 = 'h0871;
  reg2 = 'h0007;
  #10;
  // boundary case
  reg1 = 'hFFFF;
  reg2 = 'h0000;
  #10;
  // Check SRA
  alu_fn =  'h23;
  reg1 = 'hFFFF;
  reg2 = 'h0007;
  #10;
  // check CMPEQ
  alu_fn = 'h33;
  // test equal
  reg1 = 'h0871;
  reg2 = 'h0871;
  #10;
  // test not equal
  reg1 = 'h0871;
  reg2 = 'hABCD;
  #10;
  // check CMPLT
  alu_fn = 'h35;
  // less than is true
  reg1 = 'h0871;
  reg2 = 'h0A71;
  #10;
  // less that is false;
  reg1 = 'h0A71;
  reg2 = 'h0871;
  #10;
  // Check CMPLE
  alu_fn = 'h37;
  // check less than or equal
  reg1 = 'h0871;
  reg2 = 'h0A71;
  #10;
  reg1 = 'h0871;
  reg2 = 'h0871;
  #10;
  // less that is false
  reg1 = 'h0A71;
  reg2 = 'h0871;
  #10;
  
end

initial begin
  $dumpfile("alu_16_tb.vcd");
  $dumpvars(0, alu_16_tb);
  // Wait for given amount of time for simulation to complete
  #(DURATION)
  // Notify and end simulation
  $display("Finished!");
  $finish;
end

endmodule

