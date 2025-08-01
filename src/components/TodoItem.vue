<template>
  <li class="flex justify-between items-center border-2 border-black p-2 rounded-xl shadow-[0_4px_0_rgba(0,0,0,1)]">
    <span class="font-bold">{{ todo }}</span>
    <button
      @click="$emit('remove')"
      class="text-white bg-red-500 hover:bg-red-600 px-2 py-1 rounded"
    >
    <div class="pi pi-times"></div>
    </button>
  </li>
</template>

<script>
export default {
  props: ['todo'],
};
</script>
